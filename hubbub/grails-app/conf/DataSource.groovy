dataSource {
    pooled = true
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop','update'
			driverClassName = "org.hsqldb.jdbcDriver"
			username = "sa"
			password = ""
            url = "jdbc:hsqldb:mem:devDB"
			logSql = "true"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
			driverClassName = "org.hsqldb.jdbcDriver"
			username = "sa"
			password = ""
            url = "jdbc:hsqldb:mem:testDb"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:hsqldb:file:prodDb;shutdown=true"
        }
    }
}
