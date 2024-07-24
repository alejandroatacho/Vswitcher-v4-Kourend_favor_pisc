int object_a = 27555;


 GameObject craneLoc = v.getGameObject().findNearest(object_a);
    	  if (craneLoc != null && v.getLocalPlayer().hasAnimation(-1) && !v.getWalking().isMoving()) {
                int craneLocSceneX = craneLoc.getSceneMinLocation().getX();
                int craneLocSceneY = craneLoc.getSceneMinLocation().getY();
v.invoke("Repair","<col=ffff>Fishing Crane",27555,3,craneLocSceneX,craneLocSceneY,false);
    	  }
    	  else if (client.getEnergy() >= 2000) {
        v.getWalking().turnRunningOn();
    }