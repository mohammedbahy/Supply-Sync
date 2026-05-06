module com.library.supplysync {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.library.supplysync to javafx.fxml;
    exports com.library.supplysync;
}