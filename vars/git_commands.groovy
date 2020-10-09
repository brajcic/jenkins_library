
def gitClone() {

    def git_clone1 = "git clone https://github.com/brki18/ansible_for_devops.git".execute()
    def git_clone2 = "git clone https://github.com/brajcic/groovy_test.git".execute()

    return git_clone2.toString()

}

void createBranch() {
    def git_url = "https://github.com/brajcic/groovy_test.git"
    def command = "git ls-remote -h $git_url".execute()
    def command_to_branch = "git checkout -b BranchName"
    command_to_branch.execute()
}