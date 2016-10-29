public class Day06Ex03 { // program linked with patient.java and Hospital.java

  public static void main(String[] args) {
      Day06Ex03 runProgram = new Day06Ex03();
      runProgram.launch();
  }

  private void launch() {
    Hospital chicagoHospital = new Hospital();

    Patient patientIntake = new Patient("Timmy", 6, "Bonked his head");
    chicagoHospital.addPatient(patientIntake); // routes through Hospital class, calls method, with input from here
    patientIntake = new Patient("Jane", 22, "Ebola");
    chicagoHospital.addPatient(patientIntake);
    patientIntake = new Patient("Mike", 30, "Zika virus");
    chicagoHospital.addPatient(patientIntake);
    patientIntake = new Patient("Fido", 66, "Is dog");
    chicagoHospital.addPatient(patientIntake);
    patientIntake = new Patient("Jean", 25, "Dumbitis");
    chicagoHospital.addPatient(patientIntake);
    patientIntake = new Patient("Rahm", 56, "Corrupt");
    chicagoHospital.addPatient(patientIntake);
    patientIntake = new Patient("The Cubs", 125, "Choking");
    chicagoHospital.addPatient(patientIntake);
    patientIntake = new Patient("Mike Ditka", 68, "DaCoachitis");
    chicagoHospital.addPatient(patientIntake);
    patientIntake = new Patient("Mark", 59, "Broken leg");
    chicagoHospital.addPatient(patientIntake);
    patientIntake = new Patient("Ashley", 44, "Flu");
    chicagoHospital.addPatient(patientIntake);

    chicagoHospital.printPatientListForward();

    System.out.println("There are currently " + chicagoHospital.listCounter() + " patients." + '\n' );

    chicagoHospital.dischargePatient("Mike");
    chicagoHospital.dischargePatient("Rahm");

    chicagoHospital.printPatientListForward();
    chicagoHospital.printPatientListBackward();
    System.out.println("There are currently " + chicagoHospital.listCounter() + " patients." + '\n');
    patientIntake = new Patient("Nate", 29, "Stressed out");
    chicagoHospital.addPatient(patientIntake);
    chicagoHospital.dischargePatient("Marco");
  }
}
