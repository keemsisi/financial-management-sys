package com.neuralproject.financialmanagementsys.code.models.documents.admin;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Map;
import java.util.UUID;

@Document(value = "admin_activities")
public class AdminActivitiesModel {
    @Id
    private UUID uuid;
    private String activityDate ;
    private String loginDate ;
    private String logoutDate;
    private String activitiesDate ;

    @Field
    //monitor all the admin activies on the dashboard
    //and the send the activites to the server to save
    //send the pages that the admin navigated to
    // the date and time the page was visited
    // the actions that was performed on that page 
    @OneToOne
    private Map<String , String> dashboardActivities ; // the actions the admin  performed



    public String getActivitiesDate() {
        return activitiesDate;
    }

    public void setActivitiesDate(String activitiesDate) {
        this.activitiesDate = activitiesDate;
    }

    public Map<String, String> getDashboardActivities() {
        return dashboardActivities;
    }

    public void setDashboardActivities(Map<String, String> dashboardActivities) {
        this.dashboardActivities = dashboardActivities;
    }

    public UUID getUuid() {
        return uuid;
    }
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
    public String getActivityDate() {
        return activityDate;
    }
    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }
    public String getLoginDate() {
        return loginDate;
    }
    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }
    public String getLogoutDate() {
        return logoutDate;
    }
    public void setLogoutDate(String logoutDate) {
        this.logoutDate = logoutDate;
    }
}
