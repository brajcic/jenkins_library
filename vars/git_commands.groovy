
def gitClone() {
    def git_clone1 = "git clone https://github.com/brki18/ansible_for_devops.git".execute()
    def git_clone2 = "git clone https://github.com/brajcic/groovy_test.git".execute()
    def git_clone3 = "git clone https://brajcic:BojanRajcic2512@github.com/brajcic/private_rep.git".execute()

    return git_clone3.toString()

}