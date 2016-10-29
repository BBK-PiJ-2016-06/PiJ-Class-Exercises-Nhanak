public class Patient { // this patient is doubly-linked

  private String name;
  private int age;
  private String illness;
  private Patient nextPatient;
  private Patient prevPatient;


  public Patient(String name, int age, String illness) {  // constructor method setting private fields of a patient
      this.name = name;
      this.age = age;
      this.illness = illness;
      this.nextPatient = null;
  }

  public String getPatientName() {
    return name;
  }
  public int getPatientAge() {
    return age;
  }
  public String getPatientIllness() {
    return illness;
  }
  public Patient getNextPatient() {
    return nextPatient;
  }
  public Patient getPrevPatient() {
    return prevPatient;
  }
  public void setNextPatient(Patient nextPatient) {
    this.nextPatient = nextPatient; // this.nextPatient is the formerly null nextPatient pointer. nextPatient is your
  }                                 // newest  - 'addedPatient'
  public void setPrevPatient(Patient prevPatient) {
    this.prevPatient = prevPatient;
  }
}
