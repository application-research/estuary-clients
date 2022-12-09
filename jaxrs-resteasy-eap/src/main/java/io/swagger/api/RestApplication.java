package io.swagger.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import io.swagger.api.impl.AdminApiServiceImpl;
import io.swagger.api.impl.AutoretrieveApiServiceImpl;
import io.swagger.api.impl.CollectionsApiServiceImpl;
import io.swagger.api.impl.ContentApiServiceImpl;
import io.swagger.api.impl.DealApiServiceImpl;
import io.swagger.api.impl.DealsApiServiceImpl;
import io.swagger.api.impl.GetApiServiceImpl;
import io.swagger.api.impl.MinerApiServiceImpl;
import io.swagger.api.impl.NetApiServiceImpl;
import io.swagger.api.impl.PinningApiServiceImpl;
import io.swagger.api.impl.PublicApiServiceImpl;
import io.swagger.api.impl.UserApiServiceImpl;
import io.swagger.api.impl.ViewerApiServiceImpl;

@ApplicationPath("/")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(AdminApiServiceImpl.class);
        resources.add(AutoretrieveApiServiceImpl.class);
        resources.add(CollectionsApiServiceImpl.class);
        resources.add(ContentApiServiceImpl.class);
        resources.add(DealApiServiceImpl.class);
        resources.add(DealsApiServiceImpl.class);
        resources.add(GetApiServiceImpl.class);
        resources.add(MinerApiServiceImpl.class);
        resources.add(NetApiServiceImpl.class);
        resources.add(PinningApiServiceImpl.class);
        resources.add(PublicApiServiceImpl.class);
        resources.add(UserApiServiceImpl.class);
        resources.add(ViewerApiServiceImpl.class);


        return resources;
    }




}