package backend


class Company {

    String nameCompany
    String segment
    static constraints = {
        nameCompany nullable:false, unique:true, maxSize:150, blanck:false
        segment maxSize:50,nullable:false, unique:true, blanck:false

    }
}
