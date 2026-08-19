package test
  import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class AppTest {
  @Test
  void testMessage(){
    assetEquals("Hello from jenkins",App.getMessage());
  }
}

