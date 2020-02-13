package io.cahlee.client;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SmartCard {
	private Long id;
	private String name;
	private List<Word> words;
}
