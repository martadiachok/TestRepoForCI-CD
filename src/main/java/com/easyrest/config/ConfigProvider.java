package com.easyrest.config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config readConfig = readConfig();

    static Config readConfig() {
        return ConfigFactory.load("properties.conf");
    }

    /**
     * Read UsersParam
     */
    String clientEmail = readConfig.getString("usersParams.client.email");
    String clientPassword = readConfig.getString("usersParams.client.password");

    String adminEmail = readConfig.getString("usersParams.admin.email");
    String adminPassword = readConfig.getString("usersParams.admin.password");

    String ownerEmail = readConfig.getString("usersParams.owner.email");
    String ownerPassword = readConfig.getString("usersParams.owner.password");

    String moderatorEmail = readConfig.getString("usersParams.moderator.email");
    String moderatorPassword = readConfig.getString("usersParams.moderator.password");

    String administratorEmail = readConfig().getString("usersParams.administrator.email");
    String administratorPassword = readConfig().getString("usersParams.administrator.password");

    String waiterEmail = readConfig.getString("usersParams.waiter.email");
    String waiterPassword = readConfig.getString("usersParams.waiter.password");

    String fakeEmail = readConfig().getString("fakeData.email");
    String fakePassword = readConfig().getString("fakeData.email");

    /**
     * Read URL
     */
    String logInPageUrl = readConfig.getString("url.generalUrl.logInPageUrl");
    String signUpPageUrl = readConfig.getString("url.generalUrl.signUpPageUrl");
    String signInPageUrl = readConfig.getString("url.generalUrl.logInPageUrl");
    String restaurantsPageUrl = readConfig().getString("url.generalUrl.restaurantsPageUrl");

    String adminPageUrl = readConfig().getString("url.adminUrl.adminPanelUrl");
    String adminPanelOwnersUrl = readConfig().getString("url.adminUrl.adminPanelOwnersUrl");
    String adminPanelModeratorsUrl = readConfig().getString("url.adminUrl.adminPanelModeratorsUrl");
    String adminPanelUsersUrl = readConfig().getString("url.adminUrl.adminPanelUsersUrl");
    String adminPanelRestaurantUrl = readConfig().getString("url.adminUrl.adminPanelRestaurantUrl");
    String ownerPageUrl = readConfig().getString("url.ownerUrl.ownerPanelUrl");

    /**
     * Read fakeDataForModeratorForm
     */
    String emailModerator = readConfig().getString("fakeDataForModeratorForm.email");
    String passwordModerator = readConfig().getString("fakeDataForModeratorForm.password");
    String phoneModerator = readConfig().getString("fakeDataForModeratorForm.phone");
    String birthDateModerator = readConfig().getString("fakeDataForModeratorForm.birthDate");
    String birthMonthModerator = readConfig().getString("fakeDataForModeratorForm.birthMonth");
    String birthYearModerator = readConfig().getString("fakeDataForModeratorForm.birthYear");
    String nameModerator = readConfig().getString("fakeDataForModeratorForm.name");

    /**
     * Read data for sign up
     */

    String testEmail = readConfig.getString("testData.email");
    String testName = readConfig.getString("testData.name");
    String testPhoneNumber = readConfig.getString("testData.phoneNumber");
    String testBirthDate = readConfig.getString("testData.birthDate");
    String testBirthMonth = readConfig.getString("testData.birthMonth");
    String testBirthYear = readConfig.getString("testData.birthYear");
    String testPassword = readConfig.getString("testData.password");

    String administratorPanelUrl = readConfig().getString("url.administratorUrl.administratorPanelUrl");
    String expectedAlertMessage = readConfig().getString("loginAlert.message");

}
