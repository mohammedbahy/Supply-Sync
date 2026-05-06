module com.library.supplysync {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.library.supplysync to javafx.fxml;
    opens com.supplysync.presentation to javafx.fxml;
    exports com.library.supplysync;
    exports com.supplysync.presentation;
}