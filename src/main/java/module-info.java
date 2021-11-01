module ku.cs {
    requires javafx.controls;
    requires javafx.fxml;

    opens ku.cs to javafx.fxml;
    exports ku.cs;

    exports ku.cs.model;
    opens ku.cs.model to javafx.fxml;

    exports ku.cs.service;
    opens ku.cs.service to javafx.fxml;

    exports ku.cs.controllers;
    opens ku.cs.controllers to javafx.fxml;
}
