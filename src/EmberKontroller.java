public class EmberKontroller {
    private Ember ember;
    private KonzolosNezet konzolosNezet;
    private SwingGUI swingGUI;

    public EmberKontroller() {
        ember = new Ember("Mézga Géza", 39);
        konzolosNezet = new KonzolosNezet();
        swingGUI = new SwingGUI();
    }

    public void adatokFrissitese(String nev, int kor) {
        ember = new Ember(nev, kor);
        konzolosNezet.megjelenitEmber(ember);
        swingGUI.megjelenitEmber(ember);
    }

    public static void main(String[] args) {
        EmberKontroller controller = new EmberKontroller();
        controller.adatokFrissitese("Mézga Aladár", 16);
    }
}