package com.emotiv.interfaces;

public interface EngineTrainInterface {
	//train
	void userAdd(int userId);
	void userRemoved();
	void trainStarted();
	void trainSucceed();
	void trainFailed();
	void trainCompleted();
	void trainRejected();
	void trainReset();
	void trainErased();
	//action
	void currentAction(int typeAction,float power);
}
