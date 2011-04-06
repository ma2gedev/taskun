package com.github.seratch.taskun.servlet;

import com.github.seratch.taskun.inject.GuiceServletInjector;
import com.google.inject.Module;

public abstract class AbstractGuiceSchedulerServlet extends AbstractSchedulerServlet {


    public abstract Module getPreparedModule();

    @Override
    protected void prepareToInit() {
        setTaskunInjector(new GuiceServletInjector(getPreparedModule()));
    }


}
