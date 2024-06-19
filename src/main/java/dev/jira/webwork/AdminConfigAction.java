package dev.jira.webwork;

import com.atlassian.jira.security.request.SupportedMethods;
import com.atlassian.jira.security.request.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.web.action.JiraWebActionSupport;

@SupportedMethods({RequestMethod.GET})
public class AdminConfigAction extends JiraWebActionSupport
{
    private static final Logger log = LoggerFactory.getLogger(AdminConfigAction.class);

    @Override
    public String execute() throws Exception {

        return super.execute(); //returns SUCCESS
    }
}
