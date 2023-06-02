import javax.swing.*;

public class SwingGUI {
    private JFrame frame;
    private JLabel nevLabel;
    private JLabel korLabel;

    public SwingGUI() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nevLabel = new JLabel();
        korLabel = new JLabel();

        JPanel panel = new JPanel();
        panel.add(nevLabel);
        panel.add(korLabel);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setTitle("Ablak");
        frame.setSize(110,100);
        frame.setVisible(true);
    }

    public void megjelenitEmber(Ember ember) {
        nevLabel.setText("Név: " + ember.getNev());
        korLabel.setText("Kor: " + ember.getKor());
    }
}
