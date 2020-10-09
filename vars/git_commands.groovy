
def gitClone() {

    def git_clone1 = "git clone https://github.com/brki18/ansible_for_devops.git".execute()
    def git_clone2 = "git clone https://github.com/brajcic/groovy_test.git".execute()

    return git_clone2.toString()

}

void createBranch() {
    def command = "git checkout -b BranchName"
    command.execute()
}