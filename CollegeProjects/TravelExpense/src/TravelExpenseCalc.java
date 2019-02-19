import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

/**
 * Created by Gundam 240sx on 7/6/2016.
 */
public class TravelExpenseCalc extends JFrame {
    public JPanel panel1;
    public JTextField textFieldParkingAmount;
    public JTextField textFieldTaxiAmount;
    public JTextField textFieldRegistrationAmount;
    public JTextField textFieldLodgingAmount;
    public JTextField textFieldTotalExpense;
    public JTextField textFieldTotalAllowableExp;
    public JTextField textFieldTotalAmountDue;
    public JTextField textFieldTotalAmountSaved;
    public JButton exitButton;
    public JTextField textFieldDays;
    public JTextField textFieldAirfareAmount;
    public JTextField textFieldCarAmount;
    public JTextField textFieldMilesDriven;
    public JButton clearButton;
    public JButton calculateButton;
    public JLabel lbldays, lblairfare, lblcar, lblmiles, lblparking, lbltaxi;


    private final double MEAL_PER_DAY = 37.00;
    private final double PARKING_PER_DAY = 10.00;
    private final double TAXI_PER_DAY = 20.00;
    private final double LODGING_PER_DAY = 95.00;
    private final double MILES_DRIVEN = .27;

    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public final int WINDOW_WIDTH = 280;
    public final int WINDOW_HEIGHT = 500;

    //constructor
    public TravelExpenseCalc(){

        getContentPane().add(panel1);
        add(panel1);
        setTitle("Travel Expense Calculator");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        pack();
        setVisible(true);


        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textFieldDays.setText("");
                textFieldAirfareAmount.setText("");
                textFieldCarAmount.setText("");
                textFieldMilesDriven.setText("");
                textFieldParkingAmount.setText("");
                textFieldTaxiAmount.setText("");
                textFieldRegistrationAmount.setText("");
                textFieldLodgingAmount.setText("");
            }
        });

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (textFieldDays.getText().equals("")){
                    textFieldDays.setText("0");
                }

                if (textFieldAirfareAmount.getText().equals("")){
                    textFieldAirfareAmount.setText("0");
                }

                if (textFieldCarAmount.getText().equals("")){
                    textFieldCarAmount.setText("0");
                }

                if (textFieldMilesDriven.getText().equals("")){
                    textFieldMilesDriven.setText("0");
                }

                if (textFieldParkingAmount.getText().equals("")){
                    textFieldParkingAmount.setText("0");
                }

                if (textFieldTaxiAmount.getText().equals("")){
                    textFieldTaxiAmount.setText("0");
                }

                if (textFieldRegistrationAmount.getText().equals("")){
                    textFieldRegistrationAmount.setText("0");
                }

                if (textFieldLodgingAmount.getText().equals("")){
                    textFieldLodgingAmount.setText("0");
                }

                int days;
                days = Integer.parseInt(textFieldDays.getText());

                double airfareAmount, carRental, milesDriven, parkingAmount, taxiAmount, regiAmount, lodgingAmount;
                airfareAmount = Double.parseDouble(textFieldAirfareAmount.getText());
                formatter.format(airfareAmount);
                carRental= Double.parseDouble(textFieldCarAmount.getText());
                formatter.format(carRental);
                milesDriven = Double.parseDouble(textFieldMilesDriven.getText());
                parkingAmount = Double.parseDouble(textFieldParkingAmount.getText());
                formatter.format(parkingAmount);
                taxiAmount = Double.parseDouble(textFieldTaxiAmount.getText());
                formatter.format(taxiAmount);
                regiAmount = Double.parseDouble(textFieldRegistrationAmount.getText());
                formatter.format(regiAmount);
                lodgingAmount = Double.parseDouble(textFieldLodgingAmount.getText());
                formatter.format(lodgingAmount);

                double totalExpenses;
                totalExpenses = airfareAmount + carRental + parkingAmount +
                        + taxiAmount + regiAmount + lodgingAmount;

                double totalAllowedExpenses;
                totalAllowedExpenses = (days * MEAL_PER_DAY) +(days *PARKING_PER_DAY)
                        + (days * TAXI_PER_DAY) + (days * LODGING_PER_DAY) + (milesDriven * MILES_DRIVEN);

                double totalAmountDue, totalAmountSaved;

                if(totalExpenses - totalAllowedExpenses > 0){
                    totalAmountDue = totalExpenses - totalAllowedExpenses;
                    totalAmountSaved = 0.00;
                }
                else {
                    totalAmountSaved = totalAllowedExpenses - totalExpenses;
                    totalAmountDue = 0.00;
                }

                String totExp, totAllow, totAmtDue, totAmtSav;

                totExp = String.valueOf(totalExpenses);
                textFieldTotalExpense.setText(totExp);

                totAllow = String.valueOf(totalAllowedExpenses);
                textFieldTotalAllowableExp.setText(totAllow);

                totAmtDue = String.valueOf(totalAmountDue);
                textFieldTotalAmountDue.setText(totAmtDue);

                totAmtSav = String.valueOf(totalAmountSaved);
                textFieldTotalAmountSaved.setText(totAmtSav);

            }
        });

    }

   private void buildPanel() {
    }

    public static void main(String[] args) {
        new TravelExpenseCalc();
    }


}

