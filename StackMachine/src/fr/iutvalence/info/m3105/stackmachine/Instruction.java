package fr.iutvalence.info.m3105.stackmachine;

public class Instruction {

	private final int opcode;
	private final int[] param;

	public Instruction(int opcode, int[] param) {
		this.opcode = opcode;
		this.param = param;
	}

	public int getOpCode() {
		return this.opcode;
	}

	public int[] getParams() {
		return this.param;
	}

}
