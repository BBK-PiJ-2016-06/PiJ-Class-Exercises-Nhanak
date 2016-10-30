public class CircularHospital { // contains the methods used to manipulate the list

  Patient firstInList = null;

  public void addPatient(Patient newIntake) { // add any new patients to the list
    if (firstInList == null) {
      firstInList = newIntake;
      firstInList.setNextPatient(newIntake); // sets firstInList to point at itself
    } else {
        Patient current = firstInList; // starts the checking at the beginning
        while (current.getNextPatient() != firstInList) { // if current = firstInList, it means it's at the end
          current = current.getNextPatient();
        }
        current.setNextPatient(newIntake); // so then reassign the pointer from firstInList and point it to newIntake
        newIntake.setNextPatient(firstInList); // newIntake then points to the beginning
      }
  }

  public void dischargePatient(String name) { // this method removes patients
    if (firstInList == null) {          // first checks to make sure there is at least one person
      System.out.println("There is no one to remove");
      return;
    }
    Patient current = firstInList;  // starts check at beginning of list
    if (firstInList.getPatientName().equals(name)) {  // set this up to detect if it's the first person we're removing
      System.out.println("Removing " + name);
      firstInList = firstInList.getNextPatient();
      System.out.println("Now the first patient is " + firstInList.getPatientName());
      return;
    }
    while (current.getNextPatient() != firstInList) {   // if current.getNextPatient = null, we're at the end of the list
      if (current.getNextPatient().getPatientName().equals(name)) {
        System.out.println("Discharging: " + name);
        current.setNextPatient(current.getNextPatient().getNextPatient());
        System.out.println("Now we have: " + current.getPatientName() + " with " + current.getNextPatient().getPatientName() + " after them.");
        return;
      } else {
      current = current.getNextPatient();
        }
      if (current.getNextPatient() == firstInList) {
        System.out.println(name + " is not a patient in this hospital");
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
    while (current.getNextPatient() != firstInList) {
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
      Patient printer = firstInList;
      do {
        System.out.print("patient Name: " + printer.getPatientName());
        System.out.println(" || Illness: " + printer.getPatientIllness());
        printer = printer.getNextPatient();
      } while (printer.getNextPatient() != firstInList);
      System.out.println("patient Name: " + printer.getPatientName() + " || Illness: " + printer.getPatientIllness());
  }

  public void printPatientListBackward() { // prints list from back to front
    if (firstInList == null) { // checks to see if list is empty.
      System.out.println("Hospital is empty");
      return;
    }
    Patient current = firstInList;
    Patient currentCopier;
    while ( current.getNextPatient() != firstInList) { // moves current to get to the end of the list
      current = current.getNextPatient();
    }
    currentCopier = current;
    System.out.println("<<<<<< Printing List Backwards");
    System.out.print("Patient Name: " + current.getPatientName()); // must print the last patient after loop
    System.out.print(" || Patient Illness: " + current.getPatientIllness() + '\n');

    boolean currentIsFirstInList = false;
    while (!currentIsFirstInList) {
      while (current.getNextPatient() != currentCopier ) { //checks to see if at front of the list
        current = current.getNextPatient();  //
      }
      System.out.print("Patient Name: " + current.getPatientName()); // must print the last patient after loop
      System.out.print(" || Patient Illness: " + current.getPatientIllness() + '\n');
      currentCopier = current;
      if (current == firstInList) {  // checks to see if current has gotten to the front of the list
        currentIsFirstInList = true; // if so, boolean loop stops and it exits
      }
    }
  }

}
