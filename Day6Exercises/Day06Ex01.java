public class Day06Ex01 { // program linked with patient.java and Hospital.java

  public static void main(String[] args) {
      Launcher runProgram = new Launcher();
      runProgram.launch();
  }

  private void launch() {
    Hospital chicagoHospital = new Hospital();

    Patient patientIntake = new Patient("Timmy", 6, "Bonked his head");
    chicagoHospital.addPatient(patientIntake); // routes through Hospital class, calls method, with input from here
    patientIntake = new Patient("Jane", 22, "ebola");
    chicagoHospital.addPatient(patientIntake);
    patientIntake = new Patient("Mike", 30, "zika virus");
    chicagoHospital.addPatient(patientIntake);




    printPatientList();

  }

}
