module ru.gb.gbchat2 {
    requires javafx.controls;
    requires javafx.fxml;

    exports ru.gb.gbchat2.client;
    opens ru.gb.gbchat2.client to javafx.fxml;
}