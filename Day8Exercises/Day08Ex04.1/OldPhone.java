public class OldPhone implements Phone {

  private String brand = null;

  public void call(String phoneNumber) {
    System.out.println("Dialing: " + phoneNumber);
  }

  public OldPhone(String brand) {
  this.brand = brand;
  }

  public String getBrand() {
    return brand;
  }

}
