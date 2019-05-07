
class MassStartResult extends AbsSkiing implements IEvent{
	
	MassStartResult(double time, int position){
		super(time, position);
	}

	public double pointsEarned() {
		return this.time;
	}

}
