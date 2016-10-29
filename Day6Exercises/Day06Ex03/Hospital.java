public class Hospital { // contains the methods used to manipulate the list

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
        newIntake.setPrevPatient(current);
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
        System.out.println("and " + current.getPrevPatient().getPatientName() + " is before them");
      } else {
      current = current.getNextPatient();
        }
    }
      if (current.getNextPatient() == null) {
        System.out.println(name + " is not a patient in this hospital");
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

  public void printPatientListForward() { // prints list of all current patients
      if (firstInList == null) {
        System.out.println("Hospital is empty");
        return;
      }
      Patient current = firstInList;
      do {
        System.out.print("Patient Name: " + current.getPatientName());
        System.out.print(" || Patient Illness: " + current.getPatientIllness() + '\n');
        current = current.getNextPatient();
      } while (current != null);
  }

  public void printPatientListBackward() { // prints list from back to front
    if (firstInList == null) { // checks to see if list is empty.
      System.out.println("Hospital is empty");
      return;
    }
    Patient current = firstInList;
    while ( current.getNextPatient() != null) { // moves current to get to the end of the list
      current = current.getNextPatient();
    }
    System.out.println("<<<<<< Printing List Backwards");
    while (current.getPrevPatient() != null) { //checks to see if at front of the list
      System.out.print("Patient Name: " + current.getPatientName());
      System.out.print(" || Patient Illness: " + current.getPatientIllness() + '\n');
      current = current.getPrevPatient();  // then sets current to the person before it
    }
    System.out.print("Patient Name: " + current.getPatientName()); // must print the last patient after loop
    System.out.print(" || Patient Illness: " + current.getPatientIllness() + '\n');
  }

}
