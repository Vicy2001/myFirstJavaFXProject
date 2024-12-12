module at.ac.fhcampuswien.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens at.ac.fhcampuswien.demo to javafx.fxml;
    exports at.ac.fhcampuswien.demo;
}