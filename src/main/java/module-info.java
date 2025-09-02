module com.honghu.jinhe {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.honghu.jinhe to javafx.fxml;
    exports com.honghu.jinhe;
}