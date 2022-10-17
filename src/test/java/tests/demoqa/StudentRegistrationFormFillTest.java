package tests.demoqa;

import org.junit.jupiter.api.Test;
import tests.demoqa.data.PracticeFormData;
import tests.demoqa.pages.PracticeFormPage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class StudentRegistrationFormFillTest extends TestBase {
    public static PracticeFormData formData = new PracticeFormData();
    public static PracticeFormPage practiceFormPage = new PracticeFormPage();

    @Test
    void fillAutomationPracticeForm() {
        step("Open registrations form", () -> open("/automation-practice-form"));
        step("Remove banners", () -> practiceFormPage.removeBanners());
        step("Fill registrations form", () -> practiceFormPage.fillAPFFormAndSubmit(formData));
        step("Check form results", () -> practiceFormPage.checkEquals(formData));
    }
}
