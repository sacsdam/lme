package com.lme.robot.planet;

public enum Direction {


    N(0,1) {
        @Override
        public Direction left() {
            return W;
        }

        @Override
        public Direction right() {
            return E;
        }
    },

    S(0,-1) {
        @Override
        public Direction right() {
            return W;
        }

        @Override
        public Direction left() {
            return E;
        }
    },

    E(1,0) {
        @Override
        public Direction right() {
            return S;
        }

        @Override
        public Direction left() {
            return N;
        }
    },

    W(-1,0) {
        @Override
        public Direction right() {
            return N;
        }

        @Override
        public Direction left() {
            return S;
        }
    };

    private final int gridStepSizeOnXAxis;
    private final int gridStepSizeOnYAxis;
    Direction(final int stepSizeOnXAxis, final int stepSizeOnYAxis) {
        this.gridStepSizeOnXAxis = stepSizeOnXAxis;
        this.gridStepSizeOnYAxis = stepSizeOnYAxis;
    }

    public abstract Direction right();
    public abstract Direction left();

    public int stepSizeForXAxis() {
        return this.gridStepSizeOnXAxis;
    }

    public int stepSizeForYAxis() {
        return this.gridStepSizeOnYAxis;
    }

}
