module securityModule {
   // exports catpoint.service;
    requires java.desktop;
    requires java.prefs;
    requires com.google.common;
    requires com.google.gson;
    requires java.sql;
    requires miglayout;
    requires imageModule;


    opens catpoint.data.service to imageModule;
    //requires imageModule;

}