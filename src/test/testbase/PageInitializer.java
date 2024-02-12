package src.test.testbase;

import src.test.pages.LoginPageElements;
import src.test.pages.PatientPortalElements;
import src.test.pages.ProfilPageElements;

public class PageInitializer {
    public static LoginPageElements login;
    public static PatientPortalElements portal;

    public static ProfilPageElements profil;

    public static void initialize() {
    login = new LoginPageElements();
    portal = new PatientPortalElements();
    profil = new ProfilPageElements();

    }
}
