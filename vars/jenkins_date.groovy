import org.learn.devops.*

def getTime() {

    JenkinsDate jenkinsDate = new JenkinsDate()
    return  jenkinsDate.getCurrentDate()

}