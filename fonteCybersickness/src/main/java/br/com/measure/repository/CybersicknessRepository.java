package br.com.measure.repository;

import br.com.measure.entity.Dados;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.cloud.firestore.QuerySnapshot;
import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@ApplicationScoped
@Unremovable
public class CybersicknessRepository {

    private static final String COLLECTION_NAME = "cybersickness";
    private final Firestore firestore;

    public CybersicknessRepository() throws IOException {

        FirestoreOptions firestoreOptions = FirestoreOptions.newBuilder()
                .setProjectId("cybersickness-1ec86")
                .build();
        this.firestore = firestoreOptions.getService();

    }

    public List<Dados> obterListSickness() throws ExecutionException, InterruptedException {
        CollectionReference dataCollection = firestore.collection(COLLECTION_NAME);
        ApiFuture<QuerySnapshot> future = dataCollection.get();
        QuerySnapshot querySnapshot = future.get();
        if (!querySnapshot.isEmpty()) {
            return querySnapshot.toObjects(Dados.class);
        } else {
            return null;
        }
    }

}
