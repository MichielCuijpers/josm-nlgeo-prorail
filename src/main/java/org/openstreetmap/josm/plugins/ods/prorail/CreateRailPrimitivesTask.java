package org.openstreetmap.josm.plugins.ods.prorail;

import org.openstreetmap.josm.plugins.ods.PrimitiveBuilder;
import org.openstreetmap.josm.plugins.ods.tasks.Task;

/**
 * This task creates the OSM primitives and draws them on the datalayer.
 * 
 * @author Gertjan Idema <mail@gertjanidema.nl>
 *
 */
public class CreateRailPrimitivesTask implements Task {
    private GtRailStore railStore;
    private PrimitiveBuilder<Rail> primitiveBuilder;

    public CreateRailPrimitivesTask(GtRailStore railStore,
            PrimitiveBuilder<Rail> primitiveBuilder) {
        super();
        this.railStore = railStore;
        this.primitiveBuilder = primitiveBuilder;
    }


    @Override
    public void run() {
        for (Rail rail : railStore) {
            primitiveBuilder.createPrimitives(rail);
        }
    }

}