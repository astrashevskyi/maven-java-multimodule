module org.no.userdaomodule {
    requires org.no.entitymodule;
    requires org.no.daomodule;
    provides org.no.dao.Dao with org.no.userdao.UserDao;
    exports org.no.userdao;
}