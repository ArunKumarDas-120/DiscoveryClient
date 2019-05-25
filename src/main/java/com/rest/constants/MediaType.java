package com.rest.constants;

public enum MediaType {
	JSON {
		public String toString() {
			return "application/json";
		}
	},
	XML {
		public String toString() {
			return "application/xml";
		}
	}
}
