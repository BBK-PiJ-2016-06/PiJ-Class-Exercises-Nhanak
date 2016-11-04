public class CompanyLauncher {

  public static void main(String[] args) {
    CompanyLauncher launcher = new CompanyLauncher();
    launcher.launch();
  }

  public void launch(){

    Company myCompany = new Company();

    myCompany.empNameList.printListForward();
    myCompany.empNameList.printListBackward();
    myCompany.natlInsNumList.printListForward();
    myCompany.natlInsNumList.printListBackward();

    DoublyLinkedElement<String> employee = new DoublyLinkedElement<String>("Steve J");
    myCompany.empNameList.addElement(employee);
    employee = new DoublyLinkedElement<String>("Jimmy Paige");
    myCompany.empNameList.addElement(employee);
    employee = new DoublyLinkedElement<String>("Jimmy Hendrix");
    myCompany.empNameList.addElement(employee);
    employee = new DoublyLinkedElement<String>("Thom Yorke");
    myCompany.empNameList.addElement(employee);
    employee = new DoublyLinkedElement<String>("Cat Stevens");
    myCompany.empNameList.addElement(employee);
    myCompany.empNameList.printListForward();
    myCompany.empNameList.printListBackward();
    myCompany.empNameList.deleteElement("Steve J");
    myCompany.empNameList.printListForward();
    myCompany.empNameList.deleteElement("Cat Stevens");
    myCompany.empNameList.printListForward();
    DoublyLinkedElement<Integer> natlInsNum = new DoublyLinkedElement<Integer>(729292);
    myCompany.natlInsNumList.addElement(natlInsNum);
    natlInsNum = new DoublyLinkedElement<Integer>(478393);
    myCompany.natlInsNumList.addElement(natlInsNum);
    natlInsNum = new DoublyLinkedElement<Integer>(466693);
    myCompany.natlInsNumList.addElement(natlInsNum);
    natlInsNum = new DoublyLinkedElement<Integer>(1223);
    myCompany.natlInsNumList.addElement(natlInsNum);
    myCompany.natlInsNumList.printListForward();
    myCompany.natlInsNumList.printListBackward();
    myCompany.natlInsNumList.deleteElement(466693);
    myCompany.natlInsNumList.printListForward();
    myCompany.natlInsNumList.deleteElement(888889999);

  }

}
