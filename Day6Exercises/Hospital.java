public class Hospital { // contains list of patients and the methods used to manipulate the list

  Patient firstInList = null;

  public void addPatient(Patient newIntake) {
    if (firstInList == null) {
      firstInList = newIntake;
      return;
    }
    Patient nullChecker = firstInList; // starts the checking at the beginning
    while (nullChecker != null) {
      nullChecker = nullChecker.getNextPatient();
    }
    nullChecker.setNextPatient(newIntake);
  }

  public void printPatientList() {
      if (firstInList == null) {
        System.out.println("Hospital is empty");
        return;
      }
      Patient printer = firstInList;
      do {
        System.out.println("patient Name: " + printer.getPatientName());
        System.out.println("Patient Illness: " + printer.getPatientIllness());
        System.out.println(">>>>>>");
        printer = printer.getNextPatient();
      } while (printer != null);
  }

}
