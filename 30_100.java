int object_a = 27557;


 GameObject wormHole = v.getGameObject().findNearest(object_a);
    	  if (wormHole != null && v.getLocalPlayer().hasAnimation(-1) && !v.getWalking().isMoving()) {
                int wormHoleSceneX = wormHole.getSceneMinLocation().getX();
                int wormHoleSceneY = wormHole.getSceneMinLocation().getY();
v.invoke("Dig","<col=ffff>Sandworm castings",27557,3,wormHoleSceneX,wormHoleSceneY,false);
    	  }
    	  else if (client.getEnergy() >= 2000) {
        v.getWalking().turnRunningOn();
    }