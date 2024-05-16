module com.empresa.javafxmongocurd100 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.empresa.javafxmongocurd100 to javafx.fxml;
    exports com.empresa.javafxmongocurd100;
}