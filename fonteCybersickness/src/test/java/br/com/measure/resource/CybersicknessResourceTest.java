package br.com.measure.resource;

import br.com.measure.entity.Dados;
import br.com.measure.service.CybersicknessService;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.*;

@QuarkusTest
class CybersicknessResourceTest {


//    @Mock
//    CybersicknessService cybersicknessService;
//    @InjectMocks
//    CybersicknessResource cybersicknessResource;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
    @Test
    void testGetItem() {
        given()
            .when().get("/v1/cybersickness")
            .then()
            .statusCode(200);
//            .body(is("Hello cybersickness"));


//        when(cybersicknessService.listarCybersickness()).thenReturn(List.of(new Dados()));
//        Response result = cybersicknessResource.getItem();
//        Assertions.assertEquals(null, result);
    }
}
