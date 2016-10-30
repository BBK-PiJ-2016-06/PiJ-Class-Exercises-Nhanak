public class SpyHunter {

  public static void main(String[] args){

  SpyHunter jamesBond = new SpyHunter();
  jamesBond.launch();
  }

  private void launch() {

    Spy sabateur1 = new Spy(477993);
    Spy sabateur2 = new Spy(347583);
    Spy sabateur3 = new Spy(289202);
    Spy sabateur4 = new Spy(292392);
    Spy sabateur5 = new Spy(666992);
    Spy sabateur6 = new Spy(555666);

    sabateur4.die();
    sabateur2.die();
  }

}
