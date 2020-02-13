package io.cahlee.client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Word {
	private Long id;
	String word;
	String mean;
	boolean isMemorized;
}
