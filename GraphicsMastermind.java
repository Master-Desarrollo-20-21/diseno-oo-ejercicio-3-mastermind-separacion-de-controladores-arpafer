package mastermind_presentationmodel_dobledispaching;

import mastermind_presentationmodel_dobledispaching.views.View;
import mastermind_presentationmodel_dobledispaching.views.graphics.GraphicsView;

public class GraphicsMastermind extends Mastermind {

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

    public GraphicsMastermind() {
        super();
    }

    @Override
    protected View createView() {
        return new GraphicsView();
    }
}
