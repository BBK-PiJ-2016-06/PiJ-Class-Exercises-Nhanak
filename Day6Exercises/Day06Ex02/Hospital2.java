public class Hospital2 { // contains the methods used to manipulate the list

  Patient firstInList = null;

  public void addPatient(Patient newIntake) { // add any new patients to the list
    if (firstInList == null) {
      firstInList = newIntake;
    } else {
        Patient current = firstInList; // starts the checking at the beginning
        while (current.getNextPatient() != null) {
          current = current.getNextPatient();
        }
        current.setNextPatient(newIntake);
      }
  }

  public void dischargePatient(String name) { // this method removes patients
    if (firstInList == null) {          // first checks to make sure there is at least one person
      System.out.println("There is no one to remove");
      return;
    }
    if (firstInList.getPatientName().equals(name)) {  // set this up to detect if it's the first person we're removing
      System.out.println("Removing " + name);
      firstInList = firstInList.getNextPatient();
      System.out.println("Now the first patient is " + firstInList.getPatientName());
      return;
    }
    Patient current = firstInList;  // starts check at beginning of list
    while (current.getNextPatient() != null) {   // if current.getNextPatient = null, we're at the end of the list
      if (current.getNextPatient().getPatientName().equals(name)) {
        System.out.println("Discharging: " + name);
        current.setNextPatient(current.getNextPatient().getNextPatient());
        System.out.println("Now we have: " + current.getPatientName() + " with " + current.getNextPatient().getPatientName() + " after them.");
      } else {
      current = current.getNextPatient();
        }
    }
  }

  public int listCounter() { // counter that tallies list of patients when called
    int counter = 0;
    if (firstInList == null) {
      return counter;
    } else {
      counter++;
      }
    Patient current = firstInList;
    while (current.getNextPatient() != null) {
      current = current.getNextPatient();
      counter++;
    }
    return counter;
  }

  public void printPatientList() { // prints list of all current patients
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
