import { WebPlugin } from '@capacitor/core';

import type { ContextMenuPlugin } from './definitions';

export class ContextMenuWeb extends WebPlugin implements ContextMenuPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
