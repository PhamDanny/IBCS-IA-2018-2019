/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainUI;

import java.util.ArrayList;

/**
 *
 * @author htvph
 */
public class DashboardManager {
    static ArrayList<Dashboard> dashboards = new ArrayList<>();

    public DashboardManager() {
        
    }    
    public static void updateDashboards() {
        for(Dashboard dashboard : dashboards) {
            dashboard.updateClassButtons();
            dashboard.updateHomePanels();
            dashboard.updateCategoriesLists(Dashboard.currentClass);
            dashboard.updateAssignmentLists(Dashboard.currentClass);
        }
    }
}
