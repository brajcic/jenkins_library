package org.learn.devops

import java.text.SimpleDateFormat

class JenkinsDate {
    String getCurrentDate() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
        Date date = new Date()

        String time = simpleDateFormat.format(date)

        return time
    }
}
