module org.no.mainappmodule {
    requires org.no.entitymodule;
    requires org.no.daomodule;
    requires org.no.userdaomodule;
    uses org.no.dao.Dao;
}