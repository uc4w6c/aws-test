package com.myorg;

import software.amazon.awscdk.core.App;

public final class CdkHelloApp {
    public static void main(final String[] args) {
        App app = new App();

        new CdkHelloStack(app, "CdkHelloStack");

        app.synth();
    }
}
