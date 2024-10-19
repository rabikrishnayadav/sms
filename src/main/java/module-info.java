module com.vidsik.sms {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.vidsik.sms to javafx.fxml;
    exports com.vidsik.sms;
}
